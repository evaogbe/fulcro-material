(ns ogbe.fulcro.mui.icons.snooze-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SnoozeOutlined" :default SnoozeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snooze-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SnoozeOutlined)))