(ns ogbe.fulcro.mui.icons.mosque
  #?(:cljs (:require
            ["@mui/icons-material/Mosque" :default Mosque]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mosque
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mosque)))