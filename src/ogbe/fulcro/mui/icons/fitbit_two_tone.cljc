(ns ogbe.fulcro.mui.icons.fitbit-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FitbitTwoTone" :default FitbitTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitbit-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitbitTwoTone)))