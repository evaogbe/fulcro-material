(ns ogbe.fulcro.mui.icons.verified
  #?(:cljs (:require
            ["@mui/icons-material/Verified" :default Verified]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-verified
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Verified)))