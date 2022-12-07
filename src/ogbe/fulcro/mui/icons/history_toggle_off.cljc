(ns ogbe.fulcro.mui.icons.history-toggle-off
  #?(:cljs (:require
            ["@mui/icons-material/HistoryToggleOff" :default HistoryToggleOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-history-toggle-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HistoryToggleOff)))