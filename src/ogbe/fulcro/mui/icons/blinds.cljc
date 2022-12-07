(ns ogbe.fulcro.mui.icons.blinds
  #?(:cljs (:require
            ["@mui/icons-material/Blinds" :default Blinds]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blinds
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Blinds)))