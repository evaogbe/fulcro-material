(ns ogbe.fulcro.mui.icons.curtains
  #?(:cljs (:require
            ["@mui/icons-material/Curtains" :default Curtains]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-curtains
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Curtains)))