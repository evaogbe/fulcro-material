(ns ogbe.fulcro.mui.icons.snooze
  #?(:cljs (:require
            ["@mui/icons-material/Snooze" :default Snooze]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-snooze
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Snooze)))