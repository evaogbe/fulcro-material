(ns ogbe.fulcro.mui.icons.pause
  #?(:cljs (:require
            ["@mui/icons-material/Pause" :default Pause]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pause)))