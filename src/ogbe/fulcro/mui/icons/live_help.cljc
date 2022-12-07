(ns ogbe.fulcro.mui.icons.live-help
  #?(:cljs (:require
            ["@mui/icons-material/LiveHelp" :default LiveHelp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-live-help
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LiveHelp)))