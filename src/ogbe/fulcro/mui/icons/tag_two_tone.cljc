(ns ogbe.fulcro.mui.icons.tag-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TagTwoTone" :default TagTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tag-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TagTwoTone)))