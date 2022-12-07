(ns ogbe.fulcro.mui.icons.paid-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PaidTwoTone" :default PaidTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-paid-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaidTwoTone)))