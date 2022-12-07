(ns ogbe.fulcro.mui.icons.watch-off
  #?(:cljs (:require
            ["@mui/icons-material/WatchOff" :default WatchOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WatchOff)))