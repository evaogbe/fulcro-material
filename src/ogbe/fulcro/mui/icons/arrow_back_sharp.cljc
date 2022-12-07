(ns ogbe.fulcro.mui.icons.arrow-back-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ArrowBackSharp" :default ArrowBackSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-back-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowBackSharp)))