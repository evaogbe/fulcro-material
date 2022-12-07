(ns ogbe.fulcro.mui.icons.arrow-back-ios
  #?(:cljs (:require
            ["@mui/icons-material/ArrowBackIos" :default ArrowBackIos]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-back-ios
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowBackIos)))