(ns ogbe.fulcro.mui.icons.surfing
  #?(:cljs (:require
            ["@mui/icons-material/Surfing" :default Surfing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-surfing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Surfing)))