(ns ogbe.fulcro.mui.icons.nightlife
  #?(:cljs (:require
            ["@mui/icons-material/Nightlife" :default Nightlife]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nightlife
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Nightlife)))