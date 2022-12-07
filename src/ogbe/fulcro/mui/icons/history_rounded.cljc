(ns ogbe.fulcro.mui.icons.history-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HistoryRounded" :default HistoryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-history-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HistoryRounded)))