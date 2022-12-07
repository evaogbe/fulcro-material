(ns ogbe.fulcro.mui.icons.watch-later
  #?(:cljs (:require
            ["@mui/icons-material/WatchLater" :default WatchLater]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch-later
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WatchLater)))