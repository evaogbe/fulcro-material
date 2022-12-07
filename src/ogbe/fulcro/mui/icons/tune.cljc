(ns ogbe.fulcro.mui.icons.tune
  #?(:cljs (:require
            ["@mui/icons-material/Tune" :default Tune]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tune
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tune)))