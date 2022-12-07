(ns ogbe.fulcro.mui.icons.snooze-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SnoozeSharp" :default SnoozeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snooze-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SnoozeSharp)))