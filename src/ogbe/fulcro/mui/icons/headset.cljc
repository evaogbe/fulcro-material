(ns ogbe.fulcro.mui.icons.headset
  #?(:cljs (:require
            ["@mui/icons-material/Headset" :default Headset]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-headset
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Headset)))