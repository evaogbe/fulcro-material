(ns ogbe.fulcro.mui.icons.grass-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GrassSharp" :default GrassSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grass-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GrassSharp)))