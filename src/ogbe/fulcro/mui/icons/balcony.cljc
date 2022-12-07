(ns ogbe.fulcro.mui.icons.balcony
  #?(:cljs (:require
            ["@mui/icons-material/Balcony" :default Balcony]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-balcony
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Balcony)))