(ns ogbe.fulcro.mui.icons.build-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BuildSharp" :default BuildSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BuildSharp)))