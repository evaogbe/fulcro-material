(ns ogbe.fulcro.mui.icons.watch-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WatchOutlined" :default WatchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WatchOutlined)))