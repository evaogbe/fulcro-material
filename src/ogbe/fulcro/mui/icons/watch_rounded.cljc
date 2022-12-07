(ns ogbe.fulcro.mui.icons.watch-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WatchRounded" :default WatchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WatchRounded)))