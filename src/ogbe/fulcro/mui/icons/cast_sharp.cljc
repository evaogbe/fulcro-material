(ns ogbe.fulcro.mui.icons.cast-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CastSharp" :default CastSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cast-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CastSharp)))