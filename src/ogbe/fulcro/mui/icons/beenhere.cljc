(ns ogbe.fulcro.mui.icons.beenhere
  #?(:cljs (:require
            ["@mui/icons-material/Beenhere" :default Beenhere]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-beenhere
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Beenhere)))