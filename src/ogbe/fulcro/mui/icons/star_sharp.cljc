(ns ogbe.fulcro.mui.icons.star-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StarSharp" :default StarSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarSharp)))