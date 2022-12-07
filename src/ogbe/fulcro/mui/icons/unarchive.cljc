(ns ogbe.fulcro.mui.icons.unarchive
  #?(:cljs (:require
            ["@mui/icons-material/Unarchive" :default Unarchive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-unarchive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Unarchive)))