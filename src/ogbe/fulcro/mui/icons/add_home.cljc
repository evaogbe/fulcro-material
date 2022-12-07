(ns ogbe.fulcro.mui.icons.add-home
  #?(:cljs (:require
            ["@mui/icons-material/AddHome" :default AddHome]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-home
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddHome)))