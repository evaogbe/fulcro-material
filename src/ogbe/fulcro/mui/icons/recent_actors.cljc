(ns ogbe.fulcro.mui.icons.recent-actors
  #?(:cljs (:require
            ["@mui/icons-material/RecentActors" :default RecentActors]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-recent-actors
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RecentActors)))