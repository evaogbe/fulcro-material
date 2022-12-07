(ns ogbe.fulcro.mui.icons.live-tv
  #?(:cljs (:require
            ["@mui/icons-material/LiveTv" :default LiveTv]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-live-tv
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LiveTv)))