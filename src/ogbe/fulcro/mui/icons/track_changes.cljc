(ns ogbe.fulcro.mui.icons.track-changes
  #?(:cljs (:require
            ["@mui/icons-material/TrackChanges" :default TrackChanges]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-track-changes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrackChanges)))