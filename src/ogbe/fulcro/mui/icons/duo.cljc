(ns ogbe.fulcro.mui.icons.duo
  #?(:cljs (:require
            ["@mui/icons-material/Duo" :default Duo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-duo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Duo)))