(ns ogbe.fulcro.mui.icons.history-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HistoryOutlined" :default HistoryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-history-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HistoryOutlined)))