(ns ogbe.fulcro.mui.icons.snooze-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SnoozeTwoTone" :default SnoozeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snooze-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SnoozeTwoTone)))