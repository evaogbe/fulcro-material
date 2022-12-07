(ns ogbe.fulcro.mui.icons.flare
  #?(:cljs (:require
            ["@mui/icons-material/Flare" :default Flare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flare
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flare)))