(ns ogbe.fulcro.mui.icons.add-business
  #?(:cljs (:require
            ["@mui/icons-material/AddBusiness" :default AddBusiness]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-business
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddBusiness)))