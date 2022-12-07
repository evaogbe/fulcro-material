(ns ogbe.fulcro.mui.icons.history-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HistorySharp" :default HistorySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-history-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HistorySharp)))