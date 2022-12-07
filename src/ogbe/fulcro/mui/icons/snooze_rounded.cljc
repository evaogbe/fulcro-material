(ns ogbe.fulcro.mui.icons.snooze-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SnoozeRounded" :default SnoozeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snooze-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SnoozeRounded)))