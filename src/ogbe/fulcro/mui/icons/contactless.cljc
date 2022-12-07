(ns ogbe.fulcro.mui.icons.contactless
  #?(:cljs (:require
            ["@mui/icons-material/Contactless" :default Contactless]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contactless
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Contactless)))