(ns ogbe.fulcro.mui.icons.umbrella
  #?(:cljs (:require
            ["@mui/icons-material/Umbrella" :default Umbrella]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-umbrella
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Umbrella)))