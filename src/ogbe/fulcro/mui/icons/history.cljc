(ns ogbe.fulcro.mui.icons.history
  #?(:cljs (:require
            ["@mui/icons-material/History" :default History]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-history
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory History)))