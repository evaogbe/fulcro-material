(ns ogbe.fulcro.mui.icons.celebration
  #?(:cljs (:require
            ["@mui/icons-material/Celebration" :default Celebration]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-celebration
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Celebration)))