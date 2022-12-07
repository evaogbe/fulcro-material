(ns ogbe.fulcro.mui.icons.rowing
  #?(:cljs (:require
            ["@mui/icons-material/Rowing" :default Rowing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rowing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rowing)))