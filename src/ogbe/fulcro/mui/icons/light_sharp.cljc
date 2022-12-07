(ns ogbe.fulcro.mui.icons.light-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LightSharp" :default LightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-light-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightSharp)))