(ns ogbe.fulcro.mui.icons.radar
  #?(:cljs (:require
            ["@mui/icons-material/Radar" :default Radar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Radar)))