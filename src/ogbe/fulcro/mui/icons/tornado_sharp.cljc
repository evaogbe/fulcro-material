(ns ogbe.fulcro.mui.icons.tornado-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TornadoSharp" :default TornadoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tornado-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TornadoSharp)))