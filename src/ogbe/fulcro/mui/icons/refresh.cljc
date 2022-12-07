(ns ogbe.fulcro.mui.icons.refresh
  #?(:cljs (:require
            ["@mui/icons-material/Refresh" :default Refresh]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-refresh
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Refresh)))