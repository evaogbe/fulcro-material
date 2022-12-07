(ns ogbe.fulcro.mui.icons.interests
  #?(:cljs (:require
            ["@mui/icons-material/Interests" :default Interests]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-interests
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Interests)))