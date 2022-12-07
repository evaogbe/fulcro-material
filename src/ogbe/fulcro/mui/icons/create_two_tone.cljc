(ns ogbe.fulcro.mui.icons.create-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CreateTwoTone" :default CreateTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreateTwoTone)))