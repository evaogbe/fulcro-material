(ns ogbe.fulcro.mui.icons.deblur-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DeblurTwoTone" :default DeblurTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deblur-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeblurTwoTone)))