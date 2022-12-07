(ns ogbe.fulcro.mui.icons.support-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SupportTwoTone" :default SupportTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupportTwoTone)))